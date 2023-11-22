package jdbc.client.query.parser.command;

import jdbc.client.commands.RedisCommand;
import jdbc.client.query.structures.Params;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import redis.clients.jedis.commands.ProtocolCommand;

import java.sql.SQLException;

import static jdbc.utils.Utils.getName;

public abstract class CommandParser<T extends ProtocolCommand> {

    CommandParser() {
    }

    public @NotNull RedisCommand parse(@NotNull String commandName, @NotNull Params params) throws SQLException {
        T command = parseCommand(commandName);
        if (command != null && hasKeyword(command)) {
            String keywordName = getKeywordName(params);
            if (keywordName == null)
                throw new SQLException(String.format("Query does not contain a keyword for the command %s.", command));
            return new RedisCommand(command, commandName, keywordName);
        }
        return new RedisCommand(command, commandName, null);
    }

    protected abstract @Nullable T parseCommand(@NotNull String commandName);

    protected abstract boolean hasKeyword(@NotNull T command);

    @Nullable
    private static String getKeywordName(@NotNull Params params) {
        String firstParam = params.getFirst();
        return firstParam != null ? getName(firstParam) : null;
    }
}