package jdbc.client.helpers.result.parser.type;

import java.util.Map;

public class TypeFactory {

    private TypeFactory() {
    }

    public static final String STRING = "string";

    public static final String LONG = "long";

    public static final String DOUBLE = "double";

    public static final String BOOLEAN = "boolean";

    public static final String ARRAY = "array";

    public static final Map<String, String> TUPLE = null;

    public static final Map<String, String> KEYED_LIST_ELEMENT = null;

    public static final Map<String, String> KEYED_ZSET_ELEMENT = null;

    public static final Map<String, String> GEO_COORDINATE = null;

    public static final Map<String, String> GEORADIUS_RESPONSE = null;

    public static final Map<String, String> MODULE = null;

    public static final Map<String, String> ACCESS_CONTROL_USER = null;

    public static final Map<String, String> ACCESS_CONTROL_LOG_ENTRY = null;

    public static final Map<String, String> STREAM_ENTRY_ID = null;

    public static final Map<String, String> STREAM_ENTRY = null;

    public static final Map<String, String> STREAM_READ = null;

    public static final Map<String, String> STREAM_INFO = null;

    public static final Map<String, String> STREAM_GROUP_INFO = null;

    public static final Map<String, String> STREAM_CONSUMERS_INFO = null;

    public static final Map<String, String> STRING_SCAN_RESULT = null;
}