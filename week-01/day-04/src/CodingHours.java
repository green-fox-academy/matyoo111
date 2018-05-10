public class CodingHours {
    public static void main(String[] args) {
        int semesterLong = 17;
        int dailyCodingHours = 6;
        int daysInaWeek = 5;
        int hoursCodedByAverageStudent = semesterLong*dailyCodingHours*daysInaWeek;
        System.out.println(hoursCodedByAverageStudent);
        int averageWorkingHoursWeekly = 52;
        int fullWorkingHoursPerSemester = averageWorkingHoursWeekly*semesterLong;
        float percentageCodingHours = (float)(hoursCodedByAverageStudent)/(fullWorkingHoursPerSemester);
        System.out.println(percentageCodingHours*100 + " percent of the time is spent by coding");
    }
}
