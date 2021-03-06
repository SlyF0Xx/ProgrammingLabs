package Laba2;

import Cmd.AddIfMin;

import java.util.HashMap;

/**
 * Created by SlyFox on 30.04.2017.
 */
public class RequestsResponcesTable {
    private static HashMap<Byte, String> RequestByValue;
    private static HashMap<String, Byte> RequestByName;


    public static byte getRequestByName(String name)
    {
        return RequestByName.get(name);
    }
    public static String getRequestByValue(byte value)
    {
        return RequestByValue.get(value);
    }

    public static void AddRequest(Byte value, String Name)
    {
        RequestByValue.put(value, Name);
        RequestByName.put(Name, value);
    }

    public RequestsResponcesTable()
    {
        AddRequest((byte)1, "GetPerson");
        AddRequest((byte)2, "GetPersons");
        AddRequest((byte)3, "EditPerson");
        AddRequest((byte)4, "EditPersons");
        AddRequest((byte)5, "AddPerson");
        AddRequest((byte)6, "DeletePerson");
    }

    /*
    static byte getResponceByName(String name)
    {

    }
    static String getResponceByValue(byte value)
    {

    }*/
}
