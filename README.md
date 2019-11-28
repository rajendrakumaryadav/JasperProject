### ♤✪✪✪♤ Jasper Report Project with Java to Generate a Project. ♤✪✪✪♤

- In this Project, I used simple Java and JDBC with MySQL.
- Using Java, I am trying to generate PDF Report.

````java

Map<String, Object> parameter = new HashMap<String, Object>();
JRBeanCollectionDataSource keywordCollectionDataSource = new JRBeanCollectionDataSource(keywordList);
parameter.put("KeywordsDataSource", keywordCollectionDataSource);
````

- Main Section this <b>KeywordsDataSource</b> and it will be used in Jasper Design (<b>jrxml</b>).

- Create a datasource with any name and set parameter.
````bash
$P{KeywordsDataSource}
````

- Additionally, Also make field under parameters.
````bash
$F{name}
````

- Please Check the code carefully alongwith the jrxml source.
***

- Please check <b>JasperReport.jrxml</b> and <b>JasperReportProject.java</b>.

***
♤✪✪✪   Thanks for Checking this code.   ✪✪✪♤

Code with ❤️️ by Rajendra Kumar R Yadav 😍😍
***
