package com.java.study.Lecture2;


import com.java.study.Lecture1.Study1;

import java.util.*;

//매직 넘버를 상수로 대체
public class Study2 {

    static final String SAMPLE_MERCHANT = "1894C064";
    
    public String selectMerchant(String name)
    {
        if (name.equals(SAMPLE_MERCHANT))   /// 상수로 설정해서 누가 봐도 Sample 가맹점임을 명시
        {                                   /// 상수 < ENUM 변수 사용하기
            return "가맹점 연동용";
        } else if (name.equals("21894C064"))
        {
            return "가맹점 연동용2";
        }else {
            return "무슨 가맹점인지 모르겠어";
        }
    }

    public void forEachTest()
    {
        List<String> checks = Arrays.asList("이범기후","이범기","이범기호","이범준","이범기하","이범루");
        for (String check : checks)         //인덱스 포문 말고 for each문을 사용하자
        {
            if (is3Letter(check))
            {

                System.out.printf(check);
            }
        }
    }
    public Boolean is3Letter(String text)
    {
        return(text.length() ==3);
    }


    public void antiDeleteElementInList() //동시성 문제로 인한 오류 발생
    {
        List<String> deleteList = Arrays.asList("item1","item2","item3","item4","item5");
        for(String deleteElement : deleteList)
        {
            if (deleteElement.contains("item"))
            {
                deleteList.remove(deleteElement);
            }
        }

    }

    public void deleteElementInList()           /// iterator로 해당 원소 삭제하기.
    {
        List<String> deleteList = new ArrayList<>(Arrays.asList("item1", "it1em2", "ite3m3", "item4", "item5"));


        Iterator<String> iterator = deleteList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains("item")) {
                iterator.remove();
            }
        }
        System.out.println(deleteList.get(1));

    }
    public int nonNull()
    {
        List<String> javaApiTestList = null;
        Objects.requireNonNull(javaApiTestList,"javaapiTestList is not null");
        return 1;
    }


    public static void main(String[] args) {

        Study2 study2 = new Study2();
        System.out.println(study2.selectMerchant("1894C064"));
//        study2.forEachTest();
        study2.deleteElementInList();
        System.out.println(study2.nonNull());

    }
}