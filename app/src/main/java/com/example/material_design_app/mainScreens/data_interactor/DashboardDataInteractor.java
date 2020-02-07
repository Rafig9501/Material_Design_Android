package com.example.material_design_app.mainScreens.data_interactor;

import android.content.Context;
import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.pojo.DashboardPojo;
import java.util.ArrayList;
import java.util.List;

public class DashboardDataInteractor {

    public DashboardDataInteractor(Context context) {
    }

    public List <DashboardPojo> getDashboardItems() {

        List<DashboardPojo> dashboardPojoList = new ArrayList<>();

        dashboardPojoList.add(new DashboardPojo("San Francisco, CA", "Jordan Robinson", R.drawable.cosmonaut_avatar ));

        dashboardPojoList.add(new DashboardPojo("Helen Berry", "Belgrade, Serbia", R.drawable.dj_avatar));

        dashboardPojoList.add(new DashboardPojo("Raymond Jacobs", "Belgrade, Serbia", R.drawable.diver_avatar));

        dashboardPojoList.add(new DashboardPojo("Ida Christensen", "Copenhagen, Denmark", R.drawable.astronaut_avatar));

        return dashboardPojoList;

    }
}
