package hei.school.soratra.endpoint.rest.controller;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Response {
    String original_url;
    String transformed_url;
}
