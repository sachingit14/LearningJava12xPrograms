# IsValidISBN10 – Test Cases

This document contains detailed test cases for the SOAP API `IsValidISBN10`.

## ✅ Test Case Table

| Scenario TID | Test Data | Test Case Description | Precondition | Test Steps | Expected Result | Actual Result | Steps to Execute | Expected Result | Actual Result | Status | Executed QA Name | Misc (Comments) | Priority | Is Automated |
|--------------|-----------|------------------------|--------------|-------------|------------------|----------------|-------------------|------------------|----------------|--------|-------------------|------------------|----------|---------------|
| TC_01_POSITIVE | 0471958697 | Valid ISBN-10 number | API is live | Submit valid ISBN | true | true | Same as Test Steps | true | true | Pass | Sachin | Valid ISBN format | High | Yes |
| TC_02_NEGATIVE | 047195869X | Invalid checksum | API is live | Submit invalid checksum | false | false | - | false | false | Pass | Sachin | Checksum mismatch | Medium | Yes |
| TC_03_NEGATIVE | 1234567890 | Random invalid ISBN | API is live | Submit random invalid ISBN | false | false | - | false | false | Pass | Sachin | No match in DB | Medium | Yes |
| TC_04_NEGATIVE | 0000000000 | All zeros input | API is live | Submit all zeros | false | false | - | false | false | Pass | Sachin | Valid length but invalid data | Low | Yes |
| TC_05_BOUNDARY | 123456789X | Valid ISBN ending with X | API is live | Submit ISBN with X | true | true | - | true | true | Pass | Sachin | X should be treated as 10 | High | Yes |
| TC_06_NEGATIVE | abcde12345 | Alphanumeric input | API is live | Submit alphanumeric ISBN | false / Error | false / Error | - | false | false | Pass | Sachin | Format validation | High | Yes |
| TC_07_NEGATIVE | *(empty)* | Blank input | API is live | Send empty request body | Error | Error | - | Error | Error | Pass | Sachin | Required field | High | Yes |
| TC_08_NEGATIVE | 12345 | Too short input | API is live | Send less than 10 digits | false | false | - | false | false | Pass | Sachin | Invalid length | Medium | Yes |
| TC_09_NEGATIVE | 123456789012 | Too long input | API is live | Send more than 10 digits | false | false | - | false | false | Pass | Sachin | Invalid length | Medium | Yes |
| TC_10_SECURITY | 0471958697 | SQL injection attempt | API is live | Inject SQL string | false / Error | false / Error | - | Error | Error | Pass | Sachin | Injection safe | High | No |
| TC_11_PERFORMANCE | 0471958697 | Response time under SLA | API is live | Submit valid input & measure time | < 2s | Actual time | - | < 2s | Measured | Pass | Sachin | Performance test | High | Yes |
| TC_12_VALID | 0306406152 | Another valid ISBN-10 | API is live | Submit valid ISBN | true | true | - | true | true | Pass | Sachin | Common valid case | High | Yes |
| TC_13_INVALID | 0306406151 | Valid format, wrong checksum | API is live | Submit incorrect checksum | false | false | - | false | false | Pass | Sachin | Common user mistake | High | Yes |
| TC_14_HEADER_MISSING | 0471958697 | Missing Content-Type header | API is live | Remove Content-Type | 415 / Error | Error | - | Error | Error | Pass | Sachin | Header required | High | Yes |
| TC_15_HEADER_INVALID | 0471958697 | Invalid Content-Type | API is live | Use text/html header | 415 / Error | Error | - | Error | Error | Pass | Sachin | Content-Type must be correct | Medium | Yes |
| TC_16_COOKIE_VALID | 0471958697 | With valid cookie | API is live | Send request with cookie | true | true | - | true | true | Pass | Sachin | Cookie has no effect | Low | No |
| TC_17_COOKIE_INVALID | 0471958697 | Malformed cookie | API is live | Send malformed cookie | true | true | - | true | true | Pass | Sachin | Cookie ignored | Low | No |
| TC_18_SPECIAL_CHAR | #######@@ | Special character input | API is live | Submit special characters | Error | Error | - | Error | Error | Pass | Sachin | Reject special chars | High | Yes |
| TC_19_CHINESE_INPUT | 有效编号一二三 | Chinese characters | API is live | Send Chinese characters | Error | Error | - | Error | Error | Pass | Sachin | Only numeric allowed | High | Yes |
| TC_22_UTF8_VALID | 123456789X | UTF-8 valid input | API is live | Submit with encoding | true | true | - | true | true | Pass | Sachin | Works fine | Medium | Yes |
| TC_23_UTF8_CORRUPT | %E0%A4%A | Corrupt UTF-8 | API is live | Send broken UTF-8 | Error | Error | - | Error | Error | Pass | Sachin | Format rejection | Medium | Yes |
| TC_24_TIMEOUT | 0471958697 | Simulate timeout | API throttled | Send with delay | Timeout | Timeout | - | Timeout | Timeout | Pass | Sachin | SLA breach | High | No |
| TC_25_RATE_LIMIT | 0471958697 | Flood API | API is live | 100 req in 5 sec | 429 / Error | Actual | - | Error | Actual | Pass | Sachin | Rate limit validation | High | No |
| TC_26_EMPTY_BODY | *(blank)* | Empty SOAP body | API is live | No request body | Error | Error | - | Error | Error | Pass | Sachin | Body required | High | Yes |
| TC_27_ONLY_SPACES | (spaces) | Spaces as input | API is live | Input with only spaces | false | false | - | false | false | Pass | Sachin | Whitespace not valid | Medium | Yes |
| TC_28_HTML_INPUT | <ISBN>value</ISBN> | XML input in body | API is live | Send raw XML | Error | Error | - | Error | Error | Pass | Sachin | SOAP only | High | Yes |
| TC_29_JSON_INPUT | { "isbn": "0471958697" } | Send JSON instead of XML | API is live | Submit JSON body | Error | Error | - | Error | Error | Pass | Sachin | Wrong format | High | Yes |
| TC_31_EMOJI_INPUT | 😀📘📖 | Emoji characters as input | API is live | Submit emojis in ISBN field | Error | Error | Same as test steps | Error | Error | Pass | Sachin | Emojis are not valid ISBN input | Medium | Yes |
