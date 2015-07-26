package at.lolst.api;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author jonathan
 *
 */
public final class Util {
	public static String join(List<?> list, String sep) {
		Iterator<?> it = list.iterator();
		String string = "";

		while (it.hasNext()) {
			string += it.next().toString();
			if (it.hasNext()) string += sep;
		}

		return string;
	}

	public static <T> T first(Map<?, T> map) {
		return map.values().iterator().next();
	}
}
