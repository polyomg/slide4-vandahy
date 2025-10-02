package tuda.vandahy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private String id;
    private String fullname;
    private Boolean gender;
    @Builder.Default
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday = new Date();
    @Builder.Default
    String photo = "photo.png";
    private Double mark;
}
