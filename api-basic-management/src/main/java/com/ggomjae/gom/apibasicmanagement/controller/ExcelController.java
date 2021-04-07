package com.ggomjae.gom.apibasicmanagement.controller;

import com.ggomjae.gom.apibasicmanagement.excel.ExcelExporter;
import com.ggomjae.gom.apibasicmanagement.excel.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class ExcelController {

    @GetMapping("/excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {

        User user1 = new User("ggomjae",1);
        User user2 = new User("ggomjae1",2);

        List<User> listUsers = Arrays.asList(user1,user2);
        ExcelExporter excelExporter = new ExcelExporter(listUsers);
        excelExporter.export(this.getResponse(response));
    }

    private HttpServletResponse getResponse(HttpServletResponse response){
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
        return response;
    }
}
