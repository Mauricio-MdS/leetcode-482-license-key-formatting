class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder reversedLicenseKey = new StringBuilder();
        int numberOfLetters = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '-') continue;

            reversedLicenseKey.append(Character.toUpperCase(c));
            numberOfLetters++;
            if (numberOfLetters == k) {
                reversedLicenseKey.append('-');
                numberOfLetters = 0;
            }
        }

        if (!reversedLicenseKey.isEmpty() && reversedLicenseKey.charAt(reversedLicenseKey.length() -1) == '-')
            reversedLicenseKey.deleteCharAt(reversedLicenseKey.length() -1);

        return reversedLicenseKey.reverse().toString();
    }
}