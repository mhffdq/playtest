package controllers;

import models.WikiEdit;
import net.vz.mongodb.jackson.JacksonDBCollection;
import play.modules.mongodb.jackson.MongoDB;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.wikiedit;

import java.util.Map;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public static Result wiki() {
        JacksonDBCollection<WikiEdit, String> coll = MongoDB.getCollection("edit_test",WikiEdit.class,String.class);
        Map<String, String[]> queryStrings = request().queryString();
        String title = queryStrings.get("title")[0];
        String text="";
        for(String[] str : coll.findOne().getText_editor()){
            text+="<a href =\"http://ja.wikipedia.org/wiki/%E5%88%A9%E7%94%A8%E8%80%85:"+str[1]+"\" class=\""+str[1].replaceAll(" ","")+"\">"+str[0]+"</a>";
        }


        return ok(wikiedit.render(text));
    }


}
