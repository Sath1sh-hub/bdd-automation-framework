package com.sathish.framework.dataprovider;

import org.testng.annotations.DataProvider;
import com.sathish.framework.utilities.ExcelUtil;

public class DataProviderUtil {

    @DataProvider(name = "loginData")

    public static Object[][] getLoginData() {

        return ExcelUtil.getExcelData(
                "testdata/loginData.xlsx",
                "LoginData"
        );
    }
}