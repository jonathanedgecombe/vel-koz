package at.lolst.api.model.currentgame;

/**
 * 
 * @author jonathan
 *
 */
public final class Observer {
	private final String encryptionKey;

	public Observer(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getEncryptionKey() {
		return encryptionKey;
	}
}
