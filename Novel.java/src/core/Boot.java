package core;

public class Boot {
	
	final static String OS_NAME = System.getProperty("os.name").toLowerCase();
	
	public static String getOperatingSystemName() {
		System.out.println("0perating system detected: " + OS_NAME);
		return OS_NAME;
	}
	
	public static boolean isLinux() {
        return OS_NAME.startsWith("linux");
    }

    public static boolean isMac() {
        return OS_NAME.startsWith("mac");
    }

    public static boolean isWindows() {
        return OS_NAME.startsWith("windows");
    }

    public static boolean isSunOS() {
        return OS_NAME.startsWith("sunos");
    }

	public static void EnvironmentInitialize() {
		core.Boot.getOperatingSystemName();
	}
}
