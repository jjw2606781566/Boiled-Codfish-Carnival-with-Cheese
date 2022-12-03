package Flyweight;

import Prototpye_Flyweight.Audience;
import Prototpye_Flyweight.BearAudience;
import Prototpye_Flyweight.CatAudience;
import Prototpye_Flyweight.DogAudience;
import Prototype.EDGFans;
import Prototype.Fans;
import Prototype.IGFans;
import Prototype.RNGFans;

import java.util.HashMap;

public class AttributeFactory {
    private static final HashMap<String, Fans> edgFansMap = new HashMap<>();
    private static final HashMap<String, Fans> igFansMap = new HashMap<>();
    private static final HashMap<String, Fans> rngFansMap = new HashMap<>();

    //生成一个Dog
    public static Fans setEDGFans(String nation) {
        EDGFans edgFans = (EDGFans) edgFansMap.get(nation);
        if (edgFans == null) {
            edgFans = new EDGFans(nation);
            edgFansMap.put(nation, edgFans);
            System.out.println("Here is the first " + nation + " EDGFans");
        }
        return edgFans;
    }

    //生成一个Cat
    public static Fans setIGFans(String nation) {
        IGFans igFans = (IGFans) igFansMap.get(nation);

        if (igFans == null) {
            igFans = new IGFans(nation);
            igFansMap.put(nation, igFans);
            System.out.println("Here is the first " + nation + " IGFans");
        }
        return igFans;
    }

    //生成一个Bear
    public static Fans setRNGFans(String nation) {
        RNGFans rngFans = (RNGFans) rngFansMap.get(nation);

        if (rngFans == null) {
            rngFans = new RNGFans(nation);
            rngFansMap.put(nation, rngFans);
            System.out.println("Here is the first " + nation + " RNGFans");
        }
        return rngFans;
    }
}
