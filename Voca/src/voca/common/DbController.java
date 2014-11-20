/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voca.common;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 *
 * @author manucian86
 */
public class DbController {

    private static MongoClient mongoClient;
    private static DB db;

    public static DB GetDb() throws Exception {
        if (db == null) {
            try {
                if (mongoClient == null) {
                    mongoClient = new MongoClient("localhost:27017");
                }
                
                db = mongoClient.getDB("voca");

                return db;
            } catch (UnknownHostException ex) {
                throw new Exception(ex);
            }
        } else {
            return db;
        }
    }

}
