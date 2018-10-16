package com.ctc.builder;

import java.time.LocalDate;

public class Hero {

    private final String name;
    private final String gen;
    private final LocalDate birthday;

    public Hero(Builder builder) {
        this.name = builder.name;
        this.gen = builder.gen;
        this.birthday = builder.birthday;
    }

    public static class Builder {
        private final String name;
        private String gen;
        private LocalDate birthday;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setGen(String gen){
            this.gen = gen;
            return this;
        }

        public Builder setBirthDay(LocalDate day){
            this.birthday = day;
            return this;
        }


        public Hero build(){
            return new Hero(this);
        }

    }

    public static void main(String[] args) {
        Hero build = new Builder("tom").setBirthDay(LocalDate.now()).build();
        System.out.println(build);
    }

}

