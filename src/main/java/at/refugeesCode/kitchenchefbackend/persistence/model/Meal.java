package at.refugeesCode.kitchenchefbackend.persistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@Document
public class Meal {

    @Id
    private String id;
    private String cookName;
    private String mealName;
    private String mealDescription;
    private String ingredients;

    private int year;
    private int month;
    private int day;

    private int numberOfPeople;
    private LocalTime startTime;
    private LocalTime cookTime;
    private Long preparationTime;
    private String dateTime;


    public Meal() {
    }

    public Meal(String cookName, String mealName, String mealDescription, String ingredients, int year, int month, int day, int numberOfPeople, LocalTime startTime, LocalTime cookTime, Long preparationTime, String dateTime) {
        this.cookName = cookName;
        this.mealName = mealName;
        this.mealDescription = mealDescription;
        this.ingredients = ingredients;
        this.year = year;
        this.month = month;
        this.day = day;
        this.numberOfPeople = numberOfPeople;
        this.startTime = startTime;
        this.cookTime = cookTime;
        this.preparationTime = preparationTime;
        this.dateTime = dateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCookName() {
        return cookName;
    }

    public void setCookName(String cookName) {
        this.cookName = cookName;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public Long getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Long preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getCookTime() {
        return cookTime;
    }

    public void setCookTime(LocalTime cookTime) {
        this.cookTime = cookTime;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id='" + id + '\'' +
                ", cookName='" + cookName + '\'' +
                ", mealName='" + mealName + '\'' +
                ", mealDescription='" + mealDescription + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", numberOfPeople=" + numberOfPeople +
                ", startTime=" + startTime +
                ", cookTime=" + cookTime +
                ", preparationTime=" + preparationTime +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}