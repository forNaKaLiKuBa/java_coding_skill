package com.java.study.Lecture1;

public class Study1 {
    public static void main(String[] args) {
        Study1 study1 = new Study1();
        Boolean isChecked = study1.checked();
        System.out.printf(String.valueOf(isChecked));

        Boolean isVaild = study1.IsVaild();
        System.out.printf(String.valueOf(isVaild));

        Boolean isNameVaild = study1.isNameVaild("이범기");
        System.out.printf(String.valueOf(isNameVaild));


    }

    public Boolean checked()
    {
        Boolean isChecked = true;
        Boolean isNotChecked = false;

        if (isChecked)    ///Boolean 값 비교 시 긍정을 비교하고, == true == false는 피한다.
        {
            return isChecked;
        }else {
            return isNotChecked;
        }
    }


    public Boolean antiChecked()         /// 안티 패턴 부정으로(!) 비교
    {
        Boolean isChecked = true;
        Boolean isNotChecked = false;

        if (! isChecked)    ///Boolean 값 비교 시 긍정을 비교하고, == true == false는 피한다.
        {
            return isNotChecked;
        }else {
            return isChecked;
        }
    }

    public Boolean antiIsVaild()
    {
        String name ="이범기";
        if (name.trim().isEmpty() || name ==null)
        {
            return false;
        }else {
            return true;
        }
    }

    public Boolean IsVaild()
    {
        String name ="이범기";
        return !name.trim().isEmpty() || name !=null;
    }


    public Boolean isNameVaild(String name)
    {
        return name != null && !name.isEmpty();
    }

}
