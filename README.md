# Tomcat
This is about web server 

## HTTP
### Request
#### 约束
1. 请求方法 + 统一资源标识(URI) + 协议/版本
2. 请求头
3. 实体

POST /finance-open/api/v1/operators/5a7fdd389b15c10001dd6c3d/query HTTP/1.1  
Host: forfinance-open.ngrok.wacaiyun.com  
Content-Type: application/json;charset=utf-8;  
Authorization: HmacSHA256 Credential=59fd4016a4e2590001acfc78, Signature=6e608a434be077932058adb1434a5ec77dce73c9a56d0ab2074aed6baee073ea  
Cache-Control: no-cache  
Postman-Token: 5bccd2c9-673c-4154-a86a-79937299609f  

{ "openId": "59f699d750d5f56b8fce5c9d", "limit": 200 }   

### Response
#### 约束
1. 协议 + 状态码 + 描述
2. 响应头
3. 响应实体段

HTTP/1.1 200 OK  
Server: Apache-Coyote/1.1  
Content-Type: application/json;charset=UTF-8  
Transfer-Encoding: chunked  
Date: Thu, 21 Jun 2018 05:12:13 GMT  
Connection: close  
  
9a  
{"channel":null,"data":null,"errorCode":"0000000","errorMessage":"success","uuid":null,"honorUrl":null,"filePath":null,"success":false,"requestNew":false}  
0  
  
## Socket
