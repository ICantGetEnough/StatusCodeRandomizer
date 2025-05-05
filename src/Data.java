public class Data {
    Integer[] codes = {
            100, 101, 102, 103,
            200, 201, 202, 203, 204, 205, 206,
            300, 301, 302, 303, 304, 305, 306, 307, 308,
            400, 401, 402, 403, 404, 405, 406, 407, 408, 409,
            410, 411, 412, 413, 414, 415,
            500, 501, 502, 503, 504, 505
    };

    String[] messages = {
            "Continue", "Switching Protocols", "Processing", "Early Hints",
            //200
            "OK", "Created", "Accepted", "Non-Authoritative Information", "No Content", "Reset Content", "Partial Content",
            //300
            "Multiple Choices", "Moved Permanently", "Found", "See Other", "Not Modified", "Use Proxy",
            "Unused", "Temporary Redirect", "Permanent Redirect",
            //400
            "Bad Request", "Unauthorized", "Payment Required", "Forbidden", "Not Found", "Method Not Allowed",
            "Not Acceptable", "Proxy Authentication Required", "Request Timeout", "Conflict",
            "Gone", "Length Required", "Precondition Failed", "Payload Too Large", "URI Too Long",
            "Unsupported Media Type",
            //500
            "Internal Server Error", "Not Implemented", "Bad Gateway", "Service Unavailable",
            "Gateway Timeout", "HTTP Version Not Supported"
    };
}
