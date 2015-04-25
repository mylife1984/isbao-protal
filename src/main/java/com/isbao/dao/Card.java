package com.isbao.dao;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

import java.util.List;

public class Card extends Model<Card> {
    public static Card me = new Card();

    public List<Record> getCardList() {
        return Db.find("SELECT * FROM CARD");
    }

    public List<Record> getListThanId(long id) {
        String sql = "SELECT * FROM CARD WHERE ID > ?";
        return Db.find(sql, id);
    }

    public int getMaxId() {
        String sql = "SELECT MAX(ID) AS TID FROM CARD ";
        Record record = Db.findFirst(sql);
        return record.getInt("tid") != null ?record.getInt("tid") : 0;
    }
}
