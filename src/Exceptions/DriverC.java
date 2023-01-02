package Exceptions;

import java.util.Objects;

public class DriverC extends Driver<Truck> {

    private CategoryDriverC categoryDriverC;

    public DriverC(String fullName,
                   boolean driversLicense,
                   double experience,
                   Truck vehicle,
                   CategoryDriverC categoryDriverC) {
        super(fullName, driversLicense, experience, vehicle);
        setCategoryDriverC(categoryDriverC);
    }

    public CategoryDriverC getCategoryDriverC() {
        return categoryDriverC;
    }

    public void setCategoryDriverC(CategoryDriverC categoryDriverC) {
        if (categoryDriverC == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.categoryDriverC = categoryDriverC;
    }
}
