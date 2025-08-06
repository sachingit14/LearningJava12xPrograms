# IsValidISBN10 – Test Cases

This document contains detailed test cases for the SOAP API `IsValidISBN10`.

## ✅ Test Case Table

| Scenario TID | Test Data | Test Case Description | Precondition | Test Steps | Expected Result | Actual Result | Steps to Execute | Expected Result | Actual Result | Status | Executed QA Name | Misc (Comments) | Priority | Is Automated |
|--------------|-----------|------------------------|--------------|-------------|------------------|----------------|-------------------|------------------|----------------|--------|-------------------|------------------|----------|---------------|
| TC_01_POSITIVE | 0471958697 | Valid ISBN-10 number | API is live | Submit valid ISBN | true | true | Same as Test Steps | true | true | Pass | QA_1 | Valid ISBN format | High | Yes |
| TC_02_NEGATIVE | 047195869X | Invalid checksum | API is live | Submit invalid checksum | false | false | - | false | false | Pass | QA_1 | Checksum mismatch | Medium | Yes |
| TC_03_NEGATIVE | 1234567890 | Random invalid ISBN | API is live | Submit random invalid ISBN | false | false | - | false | false | Pass | QA_1 | No match in DB | Medium | Yes |
| TC_04_NEGATIVE | 0000000000 | All zeros input | API is live | Submit all zeros | false | false | - | false | false | Pass | QA_1 | Valid length but invalid data | Low | Yes |
| TC_05_BOUNDARY | 123456789X | Valid ISBN ending with X | API is live | Submit ISBN with X | true | true | - | true | true | Pass | QA_1 | X should be treated as 10 | High | Yes |
| TC_06_NEGATIVE | abcde12345 | Alphanumeric input | API is live | Submit alphanumeric ISBN | false / Error | false / Error | - | false | false | Pass | QA_1 | Format validation | High | Yes |
| TC_07_NEGATIVE | *(empty)* | Blank input | API is live | Send empty request body | Error | Error | - | Error | Error | Pass | QA_1 | Required field | High | Yes |
| TC_08_NEGATIVE | 12345 | Too short input | API is live | Send less than 10 digits | false | false | - | false | false | Pass | QA_1 | Invalid length | Medium | Yes |
| TC_09_NEGATIVE | 123456789012 | Too long input | API is live | Send more than 10 digits | false | false | - | false | false | Pass | QA_1 | Invalid length | Medium | Yes |
| TC_10_SECURITY | 0471958697 | SQL injection attempt | API is live | Inject SQL string | false / Error | false / Error | - | Error | Error | Pass | QA_1 | Injection safe | High | No |
| TC_11_PERFORMANCE | 0471958697 | Response time under SLA | API is live | Submit valid input & measure time | < 2s | Actual time | - | < 2s | Measured | Pass | QA_1 | Performance test | High | Yes |
| TC_12_VALID | 0306406152 | Another valid ISBN-10 | API is live | Submit valid ISBN | true | true | - | true | true | Pass | QA_2 | Common valid case | High | Yes |
| TC_13_INVALID | 0306406151 | Valid format, wrong checksum | API is live | Submit incorrect checksum | false | false | - | false | false | Pass | QA_2 | Common user mistake | High | Yes |
| TC_14_HEADER_MISSING | 0471958697 | Missing Content-Type header | API is live | Remove Content-Type | 415 / Error | Error | - | Error | Error | Pass | QA_2 | Header required | High | Yes |
| TC_15_HEADER_INVALID | 0471958697 | Invalid Content-Type | API is live | Use text/html header | 415 / Error | Error | - | Error | Error | Pass | QA_2 | Content-Type must be correct | Medium | Yes |
| TC_16_COOKIE_VALID | 0471958697 | With valid cookie | API is live | Send request with cookie | true | true | - | true | true | Pass | QA_2 | Cookie has no effect | Low | No |
| TC_17_COOKIE_INVALID | 0471958697 | Malformed cookie | API is live | Send malformed cookie | true | true | - | true | true | Pass | QA_2 | Cookie ignored | Low | No |
| TC_18_SPECIAL_CHAR | #######@@ | Special character input | API is live | Submit special characters | Error | Error | - | Error | Error | Pass | QA_2 | Reject special chars | High | Yes |
| TC_19_CHINESE_INPUT | 有效编号一二三 | Chinese characters | API is live | Send Chinese characters | Error | Error | - | Error | Error | Pass | QA_2 | Only numeric allowed | High | Yes |
| TC_20_XSS_INJECTION | <script> | XSS attack | API is live | Inject script tag | Error | Error | - | Error | Error | Pass | QA_2 | Script blocked | High | Yes |
| TC_21_SQL_INJECTION | ' OR 1=1 -- | SQL injection | API is live | Inject SQL | Error | Error | - | Error | Error | Pass | QA_2 | Protected from SQLi | High | Yes |
| TC_22_UTF8_VALID | 123456789X | UTF-8 valid input | API is live | Submit with encoding | true | true | - | true | true | Pass | QA_2 | Works fine | Medium | Yes |
| TC_23_UTF8_CORRUPT | %E0%A4%A | Corrupt UTF-8 | API is live | Send broken UTF-8 | Error | Error | - | Error | Error | Pass | QA_2 | Format rejection | Medium | Yes |
| TC_24_TIMEOUT | 0471958697 | Simulate timeout | API throttled | Send with delay | Timeout | Timeout | - | Timeout | Timeout | Pass | QA_2 | SLA breach | High | No |
| TC_25_RATE_LIMIT | 0471958697 | Flood API | API is live | 100 req in 5 sec | 429 / Error | Actual | - | Error | Actual | Pass | QA_2 | Rate limit validation | High | No |
| TC_26_EMPTY_BODY | *(blank)* | Empty SOAP body | API is live | No request body | Error | Error | - | Error | Error | Pass | QA_2 | Body required | High | Yes |
| TC_27_ONLY_SPACES | (spaces) | Spaces as input | API is live | Input with only spaces | false | false | - | false | false | Pass | QA_2 | Whitespace not valid | Medium | Yes |
| TC_28_HTML_INPUT | <ISBN>value</ISBN> | XML input in body | API is live | Send raw XML | Error | Error | - | Error | Error | Pass | QA_2 | SOAP only | High | Yes |
| TC_29_JSON_INPUT | { "isbn": "0471958697" } | Send JSON instead of XML | API is live | Submit JSON body | Error | Error | - | Error | Error | Pass | QA_2 | Wrong format | High | Yes |
| TC_30_SOAP_FAULT_CHECK | 0471958697 | Trigger SOAP Fault | API faulty | Call broken service | SOAP Fault | SOAP Fault | - | SOAP Fault | SOAP Fault | Pass | QA_2 | Fault structure check | Medium | Yes |
