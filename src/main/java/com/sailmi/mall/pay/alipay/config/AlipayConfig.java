 package com.sailmi.mall.pay.alipay.config;
 
 public class AlipayConfig
 {
   private String partner = "2088521376004525";
 
   private String key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC6rxsDMZSBkv6l1DdT6ifY1hW2RCeET/06XZ5N2OwOF80poPtwNi+OYA9SKF8lyZIArgCEGzhz80W1tVKc/FqOUST43IfyxdW/jMDIxU/Kf1RobDzMuzoJnqcNjWzmwlZ9JahMj3h/A7Bmr2PzvGVPphw53k9irDSQICWvv/waWQIDAQAB";
 
   private String seller_email = "";
 
   private String notify_url = "";
 
   private String return_url = "";
 
   private String log_path = "D:\\alipay_log_" + System.currentTimeMillis() + 
     ".txt";
 
 
	// RSA2
	public static String SIGNTYPE = "RSA2";

	// 请求网关地址
	public static String URL = "https://openapi.alipay.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
		
	// 支付类型 ，无需修改
	public String payment_type = "1";
	
   private String transport = "http";
 
	// 商户appid
	public static String APPID = "2017092708963240";

	// 私钥 pkcs8格式的
   public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCKD5kIpFWfeiZ3ZKXXqJ74w0yNBl3o54jVtp1GUZXfAXgL+JJ4OVtF1QUDdVcfcGtONlIJaNYDNDQ9Q9lkZHimBd9scdZI/j0zl748Qrlk9Qbxf0vXu9o8hCj7hEbKImOaIfbXuAD5lyfPRZOz22V1ghr8fWIr/qGrfjut1vUy0gRPcvUOdc80hxMUarE1CS4qCr07cXDeVLyahe5Zs++/JQKAgRGfdKEOxDuaV4HBtCjo1Dh3C1fncdYgpV9zbUIMS8dQ+qCroN8YdY5qtW2rPBej07Cpg+Ec5Rli4d5+JRFyxiijFOw9GAYnkjgjUrok6LZMC6PWKKkRWLNu7AGDAgMBAAECggEAEexMda6/3uBAtic+0Gx3ltvjyDsXXfEQ9o2qhUJ6LmVGbGdsvGbVzo8FA5nsIYy6oYCzzbzqa6gPUBTK2BmjAAqrIqz0oK1AzL3aWIBhCRY2PIvGEM+2WTzfBSf6+KrWO2BFZ2Pf3IcfB+2Ea0kENukZD8ZHRGbeHiFZJgxN8LbaMToLSOyIzqyh4m0XYi03khen4mxLuGYM8xefpdOL7IxpK1JP0xwBrTACUAUzsEuTRBzwEsHH8xA9y779jXQp2nePBFSn1LGel3CKpvK00f2zBBSKVTertzFCbnWDC346OZQ4QdpcD8aP+RTdJsqdaBZ7kw7d2SUNesnIqWgRYQKBgQDFeiDa1K3oGAcEX3K1rlljEKPiKSVMdaUblqR6EDa5FqnEsxXSujNkjIe73K0HY6/n3aPBTswZxerpdTdyOPnmZw279XWOzpkiuL/GGm68t2tMSJydvW2vb/FQk0q6vv+4Jg1B5iAn3ay5OccbJOvNMyuBqMIc2CDDgLy2wCAtDwKBgQCy+cgoVqwMU1b/sMl4W9JIiEYt72NtUxa8D6iQKpTfCP92YN9LuyKFh5oIGtZL/BFi350kex4QIQo1Xaeou005vvTSjVuKqVpxXAFNziEGvwX2RTP+DClsUuVK7PWTKtPQszFxsD1nwPMxBEZpjSchVrjiBr/PsBKHkhNl5kJMTQKBgQDDQyltd9Klpex6VG62WrkkDXYe0JSC7+jcSK5Fy/ZwOYqQZovznA3pJFOqXF/y6I0s9alQITwLV/oZ8b9rgA8J1WhtLB6boIknHgryNXy9uZetDDdgecgVKtkv1RSVZvqv+WAugv/Uq4p4dDr+ChnnAuvH/zhBESwEZC01fu/R3QKBgBsPg0D+IdNXQn80hrHJCFlpKVtGp7ze5EAZCf6KQaobXSzT5s83gze3UgXJsP8aJLLTZpoed2Qu6rE48OGlOD7z7WZscxvbEU60f4n5EatIdKlQu1S9GAJF4l9axqKyxgX3IhGzeQVX+i0+HTtWWUVELH4YUSYg1BxlbMNqdjm9AoGBAJzn7vdYXc8K6syjrFDZA+xXkiqC3hGtIk6Ur5gQzGaDjNet7BSl2vpyWSNh0OBSQHHBwQRRgnEKyO+Sqx66yzhIY94wzF7B3HGuDPfZNvjd33N87aFtJ/S2XQa42JPavCkImu5zz2uDsX94vFoavfHQnRqNztBRCgswQ1kHop6z";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq6uM9uizQB18MdEb66ayfzOyi4ogV1Z9v8DE+PEIqfHpg6vaic0K+aHAxqkT7BANGyZSqSAb33x7BrlwvjMkrQUnai6jysy/8lBfpiqsRWBJKZth28UdIh3GK50KzkS077h4OmfvD1ij2v7+l/OoiIzPseV75x1OSZfy3HdxTUtZ3X0AkVMFsAkVukzmez8jkfMgKKqJSdoLCabPRR0JYGbOklrof4LLD3CcsRuA/4wJ7QjE5v3gc4ReRGDuEhk6GjFVtrcLU7ZW0rMY2vf5mbmfFy1BidliPE/sngGKQISmdiPkt4qCFoMelhelCmhGGrcFBv9jWeOAZHVW5ns05QIDAQAB";

 
   public static String getPrivate_key() {
     return RSA_PRIVATE_KEY;
   }
 
   public static void setPrivate_key(String private_key) {
	   RSA_PRIVATE_KEY = private_key;
   }
 
   public static String getAli_public_key() {
     return ALIPAY_PUBLIC_KEY;
   }
 
   public static void setAli_public_key(String ali_public_key) {
	   ALIPAY_PUBLIC_KEY = ali_public_key;
   }
 
   public String getPartner() {
     return this.partner;
   }
 
   public void setPartner(String partner) {
     this.partner = partner;
   }
 
   public String getKey() {
     return this.key;
   }
 
   public void setKey(String key) {
     this.key = key;
   }
 
   public String getSeller_email() {
     return this.seller_email;
   }
 
   public void setSeller_email(String seller_email) {
     this.seller_email = seller_email;
   }
 
   public String getNotify_url() {
     return this.notify_url;
   }
 
   public void setNotify_url(String notify_url) {
     this.notify_url = notify_url;
   }
 
   public String getReturn_url() {
     return this.return_url;
   }
 
   public void setReturn_url(String return_url) {
     this.return_url = return_url;
   }
 
   public String getLog_path() {
     return this.log_path;
   }
 
   public void setLog_path(String log_path) {
     this.log_path = log_path;
   }
 
   public String getInput_charset() {
     return this.CHARSET;
   }
 
   public void setInput_charset(String input_charset) {
     this.CHARSET = input_charset;
   }
 
   public String getSign_type() {
     return this.SIGNTYPE;
   }
 
   public void setSign_type(String sign_type) {
     this.SIGNTYPE = sign_type;
   }
 
   public String getTransport() {
     return this.transport;
   }
 
   public void setTransport(String transport) {
     this.transport = transport;
   }
 }


 
 
 