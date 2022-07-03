package com.test;

public class Test1 {



  public static void main(String[] args) {
    String data = "{\n" +
            "        userName:\"aa\",\n" +
            "                age:8,\n" +
            "            data:[{\n" +
            "        id:\"99\",\n" +
            "                pro:\"kk\"\n" +
            "    },\n" +
            "        {\n" +
            "            id:\"99\",\n" +
            "                    pro:\"kk\"\n" +
            "        },\n" +
            "        {\n" +
            "            id:\"99\",\n" +
            "                    pro:\"kk\"\n" +
            "        }]\n" +
            "    }\n";
    //获取对象
//    JSONObject obj = JSONObject.parseObject(data);
//    System.out.println( obj.get("userName"));

    //获取数组
//    JSONArray jarray = obj.getJSONArray("data");
//    JSONObject jobj2 = jarray.getJSONObject(0);
//    System.out.println(jobj2.get("id"));

    //遍历数组
    JSONObject obj = JSONObject.parseObject(data);
    JSONArray jarray = obj.getJSONArray("data");
    Iterator<Object> iterator = jarray.iterator();
    while (iterator.hasNext()){
      Object next = iterator.next();
      JSONObject jsonObject = JSONObject.parseObject(next.toString());
      System.out.println("id="+ jsonObject.get("id")+"name="+jsonObject.get("pro"));
    }



  }
    //333
}
