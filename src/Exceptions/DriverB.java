package Exceptions;

public class DriverB extends Driver<Car> {

    private CategoryDriverB categoryDriverB;
    public DriverB(String fullName,
                   boolean driversLicense,
                   double experience,
                   Car vehicle,
                   CategoryDriverB categoryDriverB) {
        super(fullName, driversLicense, experience, vehicle);
        setCategoryDriverB(categoryDriverB);
    }

    public CategoryDriverB getCategoryDriverB() {
        return categoryDriverB;
    }

    public void setCategoryDriverB(CategoryDriverB categoryDriverB) {
        if (categoryDriverB == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.categoryDriverB = categoryDriverB;
    }
}


