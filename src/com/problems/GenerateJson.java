package com.problems;

public class GenerateJson {
}

class BjSJsonObject {
    public String toJsonString(boolean compressed) {

        return null;
    }

    public String toJsonString(boolean compressed, int level) {

        return null;
    }
}

class BjSJsonArray {
    public String toJsonString(boolean compressed) {

        return null;
    }

    public String toJsonString(boolean compressed, int level) {

        return null;
    }
}


enum BjSJsonValueKind {
    Object,
    Array,
    String,
    Number,
    Boolean,
    Null
}

class BjSJsonHelper {


    public static BjSJsonValueKind GetValueKind(Object obj) throws Exception {
        if (obj == null)
            return BjSJsonValueKind.Null;
        else if (obj instanceof BjSJsonObject)
            return BjSJsonValueKind.Object;
        else if (obj instanceof BjSJsonArray)
            return BjSJsonValueKind.Array;
        else if (obj instanceof String)
            return BjSJsonValueKind.String;
        else if (obj instanceof Number)
            return BjSJsonValueKind.Number;
        else if (obj instanceof Boolean)
            return BjSJsonValueKind.Boolean;
        else
            throw new Exception("The pased object does not have any Type recognized by BjSJson");
    }

    private static String GetValueDisplayString(Object obj) {
        if (obj == null)
            return "null";
        else if (obj instanceof BjSJsonObject)
            return obj.toString();
        else if (obj instanceof BjSJsonArray)
            return obj.toString();
        else if (obj instanceof String)
            return "\"" + obj + "\"";
        else if (obj instanceof Number)
            return obj.toString();
        else if (obj instanceof Boolean)
            return (obj).toString();
        else
            return "unknown";
    }


    private static String EscapeString(String value) {
        StringBuilder s = new StringBuilder();

        for (char c : value.toCharArray()) {
            switch (c) {
                case '\0':
                    s.append("\\u0000");
                    break;
                case '\\':
                    s.append("\\\\");
                    break;
                case '"':
                    s.append("\\\"");
                    break;
                case '\r':
                    s.append("\\r");
                    break;
                case '\n':
                    s.append("\\n");
                    break;
                case '\t':
                    s.append("\\t");
                    break;
                case '\b':
                    s.append("\\b");
                    break;
                case '\f':
                    s.append("\\f");
                    break;
                case '/':
                    s.append("\\/");
                    break;
                default:
                    s.append(c);
                    break;
            }
        }

        return s.toString();
    }


    static String ToJsonString(Object obj, boolean compressed, int level) {
        if (obj == null)
            return "null";
        else if (obj instanceof BjSJsonObject)
            return ((BjSJsonObject) obj).toJsonString(compressed, level);
        else if (obj instanceof BjSJsonArray)
            return ((BjSJsonArray) obj).toJsonString(compressed, level);
        else if (obj instanceof String)
            return "\"" + BjSJsonHelper.EscapeString((String) obj) + "\"";
        else if (obj instanceof Number)
            return ((Number) obj).toString();
        else if (obj instanceof Boolean)
            return (Boolean) obj ? "true" : "false";
        else
            return "";
    }

}