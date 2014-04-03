package models;

import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;

import java.util.List;

/**
 * Created by Hirotaka on 2014/03/27.
 */
public class WikiEdit {
    List<String[]> text_editor;
    String title;
    int revid;
    public WikiEdit(){

    }
    public WikiEdit(List<String[]> l, String title, int id){
        text_editor=l;
        this.title=title;
        revid=id;
    }

    public void setRevid(int revid) {
        this.revid = revid;
    }

    public int getRevid() {
        return revid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setText_editor(List<String[]> text_editor) {
        this.text_editor = text_editor;
    }
    public List<String[]> getText_editor(){
        return text_editor;
    }
    @Id
    @ObjectId
    public String id;
}
