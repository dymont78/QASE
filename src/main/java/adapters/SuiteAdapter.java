package adapters;

import objects.TestSuite;

public class SuiteAdapter extends BaseAdapter{

    public static final String SUITE_URI = "suite/";

    public int create(String projectCode, TestSuite testSuite){
        return  post(SUITE_URI + projectCode, converter.toJson(testSuite)).body().path("result.id");
    }
}
