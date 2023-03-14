public class ExecuteQuery01 {




//2.Example: Select the country_id and country_name whose region_id's are greater than 2






//3.Example: Select all columns whose number_of_employees is the lowest from companies table

    String sql3="SELECT *FROM companies WHERE number_of_employees=(SELECT MIN(number_of_employees)FROM companies)";









}
