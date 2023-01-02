package Exceptions;
import java.util.Objects;
    public class DriverD extends Driver<Bus> {

        private CategoryDriverD categoryDriverD;

        public DriverD(String fullName,
                       boolean driversLicense,
                       double experience,
                       Bus vehicle,
                       CategoryDriverD categoryDriverD) {
            super(fullName, driversLicense, experience, vehicle);
            setCategoryDriverD(categoryDriverD);
        }

        public CategoryDriverD getCategoryDriverD() {
            return categoryDriverD;
        }

        public void setCategoryDriverD(CategoryDriverD categoryDriverD) {
            if (categoryDriverD == null) {
                throw new IllegalArgumentException("Необходимо указать категорию прав");
            }
            this.categoryDriverD = categoryDriverD;
        }
    }

