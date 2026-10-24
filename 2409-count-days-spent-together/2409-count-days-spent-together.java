
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
            String arriveBob, String leaveBob) {

        int[] monthDayArr = { 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        int aliceStart = getDay(arriveAlice, monthDayArr);
        int aliceEnd = getDay(leaveAlice, monthDayArr);
        int bobStart = getDay(arriveBob, monthDayArr);
        int bobEnd = getDay(leaveBob, monthDayArr);

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }

    private int getDay(String date, int[] monthDayArr) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        for (int i = 0; i < month - 1; i++) {
            day += monthDayArr[i];
        }

        return day;
    }
}
