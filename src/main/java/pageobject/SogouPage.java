package pageobject;

public class SogouPage extends BasePage{

    String searchBar = "query";
    String searchButton = "stb";

    //打开搜狗首页
    public void open(){
        util.open(sogou);
    }

    //输入关键字
    public void input(String text){
        util.inputById(searchBar, text);
    }

    //搜索
    public void search(){
        util.clickById(searchButton);
    }
}