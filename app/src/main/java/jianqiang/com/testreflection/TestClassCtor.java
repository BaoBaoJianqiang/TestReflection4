package jianqiang.com.testreflection;

import android.util.Log;

public class TestClassCtor {
    private String name;


    private static String address = "abc";

    public TestClassCtor() {
        name = "baobao";
    }

    public TestClassCtor(int a) {

    }

    public TestClassCtor(int a, String b) {
        name = b;
    }

    private TestClassCtor(int a, double c) {

    }

    private String doSOmething(String d) {
        Log.v("baobao", "TestClassCtor, doSOmething");

        return "abcd";
    }

    private String doSOmething2() {
        Log.v("baobao", "TestClassCtor, doSOmething2");

        return "abcd2";
    }

    private String doSOmething3(String d, int abc) {
        Log.v("baobao", "TestClassCtor, doSOmething3");

        return "abcd3";
    }

    private static void work() {
        Log.v("baobao", "TestClassCtor, work");
    }

    private static void work2(String d) {
        Log.v("baobao", "TestClassCtor, work2");
    }

    private static void work3(String d, int abc) {
        Log.v("baobao", "TestClassCtor, work3");
    }

    public String getName() {
        return name;
    }

    public static void printAddress() {
        Log.v("baobao", address);
    }
}
