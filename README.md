### Настройки
1. Скопировать файл *src/main/resources/config.properties.local* в ту же папку 
2. Переименовать копию в *config.properties*
3. При необходимости изменить значения внутри файла

###  Для запуска параметризированных тестов junit5
```
mvn clean -Dtest=Junit5ParamTests test
```

### Для запуска параметризированных тестов cucumber5 (ru)
```
mvn clean -Dtest=RunCucumberTest test -Dcucumber.filter.tags="@ru"
```

###  Для запуска параметризированных тестов cucumber5 (en)
```
mvn clean -Dtest=RunCucumberTest test -Dcucumber.filter.tags="@en"
```