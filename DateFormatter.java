public class DateFormatter {
    public static void main(String[] args) {
        String[] dates = { "30/10/19", "15/01/22", "23/07/21", "01/12/18", "05/05/20",
                "10/08/17", "19/03/16", "22/11/15", "13/06/14", "08/09/13" };

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        for (String date : dates) {
            String[] parts = date.split("/");
            String day = parts[0];
            int monthIndex = Integer.parseInt(parts[1]) - 1;
            String year = "20" + parts[2];

            String suffix;
            if (day.endsWith("1") && !day.equals("11")) {
                suffix = "st";
            } else if (day.endsWith("2") && !day.equals("12")) {
                suffix = "nd";
            } else if (day.endsWith("3") && !day.equals("13")) {
                suffix = "rd";
            } else {
                suffix = "th";
            }

            System.out.println(day + suffix + " " + monthNames[monthIndex] + " " + year);
        }
    }
}
