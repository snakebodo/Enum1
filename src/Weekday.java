public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public final boolean isWeekDay(){
      return !isHoliday();
    };
    public final boolean isHoliday(){
        return this== SATURDAY || this== SUNDAY;
    };
    public final void whichIsGreater(Weekday weekday){
        if(this.ordinal()<weekday.ordinal()){
            System.out.println("before "  + weekday);
        }else{
            System.out.println("after " + weekday);
        }
    }

}
