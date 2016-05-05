package qcox.tacoma.uw.edu.farmgame.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import qcox.tacoma.uw.edu.farmgame.items.PlantItems;

/**
 * This class holds some of the values that the player will need to play the game.
 *
 * Created by Quinn Cox on 5/2/2016.
 */
public class PlayerValues {

    private static int mMoney = 100;

    public static String getUserName() {
        return mUserName;
    }

    public static void setUserName(String mUserName) {
        PlayerValues.mUserName = mUserName;
    }

    public static String mUserName;
    public static final Map<String, Integer> ITEM_MAP = new HashMap<>();
    public static List<PlantItems> mPlantItemsList = new ArrayList<>();

    public static int getMoney() {
        return mMoney;
    }

    public static void setMoney(int mMoney) {
        PlayerValues.mMoney = mMoney;
    }

    public static int getItemAmount(String theItem) {
        int answer = 0;
        if (ITEM_MAP.containsKey(theItem)) {
            answer = ITEM_MAP.get(theItem);
        }
        return answer;
    }

    public static void addItemAmount(String theItem, int theAddition) {
        int amount = theAddition;
        if (ITEM_MAP.containsKey(theItem)) {
            amount = ITEM_MAP.get(theItem) + theAddition;
        }
        ITEM_MAP.put(theItem, amount);
    }

    public static void setItemAmount(String theItem, int theNewAmount) {
        ITEM_MAP.put(theItem, theNewAmount);
    }

    public static PlantItems getPlantItems(int thePos) {
        return mPlantItemsList.get(thePos);
    }

    public static void setPlantItemsList(List<PlantItems> PlantItemsList) {
        mPlantItemsList = PlantItemsList;
    }




}
