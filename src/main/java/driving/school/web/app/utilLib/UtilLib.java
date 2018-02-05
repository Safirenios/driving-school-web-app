package driving.school.web.app.utilLib;

import driving.school.web.app.entity.Driver;
import driving.school.web.app.entity.License;
import driving.school.web.app.entity.MapDetails;
import driving.school.web.app.exceptions.EmptyObjectException;

public class UtilLib {

	public static boolean containsId(Object object) throws EmptyObjectException {
		if (object != null) {
			if (object instanceof Driver) {
				Driver driver = (Driver) object;
				if ((driver.getId() != null) && (!"".equals(driver.getId().trim()))) {
					return true;
				}
			} else if (object instanceof License) {
				License license = (License) object;
				if ((license.getId() != null) && (!"".equals(license.getId().trim()))) {
					return true;
				}
			} else if (object instanceof MapDetails) {
				MapDetails mapDetails = (MapDetails) object;
				if ((mapDetails.getId() != null) && (!"".equals(mapDetails.getId().trim()))) {
					return true;
				}
			}
			return false;
		} else {
			throw new EmptyObjectException("Provided object is empty");
		}
	}

	public static void isEmptyAndThrowsException(Object object) throws EmptyObjectException {
		if (object == null) {
			throw new EmptyObjectException("Provided object is empty");
		}
	}

	public static boolean isEmpty(Object object) {
		if (object != null) {
			if (object instanceof String) {
				String string = (String) object;
				if ("".equals(string.trim())) {
					return true;
				}
			}
			return false;
		}
		return true;
	}

	public static boolean hasAllTheMandatoryFields(Object object) {
		if (!isEmpty(object)) {
			if (object instanceof Driver) {
				Driver driver = (Driver) object;
				if ((isEmpty(driver.getFirstName())) || (isEmpty(driver.getLastName()))
						|| (isEmpty(driver.getPhoneNumber())) || (isEmpty(driver.getAfm()))) {
					return false;
				} else {
					return true;
				}
			} else if (object instanceof MapDetails) {
				MapDetails mapDetails = (MapDetails) object;
				if ((isEmpty(mapDetails.getId())) || (isEmpty(mapDetails.getLatitude()))
						|| (isEmpty(mapDetails.getLongtitude()))) {
					return false;
				} else {
					return true;
				}
			} else if (object instanceof License) {
				License license = (License) object;
				if (isEmpty(license.getId())) {
					return false;
				} else {
					return true;
				}
			}
		}
		return false;
	}
}
