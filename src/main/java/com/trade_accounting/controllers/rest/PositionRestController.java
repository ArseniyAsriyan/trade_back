package com.trade_accounting.controllers.rest;

import com.trade_accounting.models.dto.PositionDto;
import com.trade_accounting.services.interfaces.PositionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

@Slf4j
@RestController
@Tag(name = "Position Rest Controller", description = "CRUD операции с позициями")
@Api(tags = "Position Rest Controller")
@RequestMapping("/api/position")
public class PositionRestController {

    private final PositionService positionService;

    public PositionRestController(PositionService positionService) {
        this.positionService = positionService;
    }

    @GetMapping
    @ApiOperation(value = "getAll", notes = "Получение списка всех позиций")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Успешное получение списка позиций"),
            @ApiResponse(code = 404, message = "Данный контроллер не найден"),
            @ApiResponse(code = 403, message = "Операция запрещена"),
            @ApiResponse(code = 401, message = "Нет доступа к данной операции")}
    )
    public ResponseEntity<List<PositionDto>> getAll() {
        List<PositionDto> positions = positionService.getAll();
        log.info("Запрошен список PositionDto");
        return ResponseEntity.ok(positions);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "getById", notes = "Получение позиции по ее id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Позиция найдена"),
            @ApiResponse(code = 404, message = "Данный контроллер не найден"),
            @ApiResponse(code = 403, message = "Операция запрещена"),
            @ApiResponse(code = 401, message = "Нет доступа к данной операции")}
    )
    public ResponseEntity<PositionDto> getById(@ApiParam(name = "id", type = "Long",
            value = "Переданный в URL id по которому необходимо найти позицию")
                                               @PathVariable(name = "id") Long id) {
        PositionDto positions = positionService.getById(id);
        log.info("Запрошен экземпляр PositionDto с id= {}", id);
        return ResponseEntity.ok(positions);
    }

    @PostMapping
    @ApiOperation(value = "create", notes = "Внесение новой позиции")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Позиция создана"),
            @ApiResponse(code = 201, message = "Запрос принят и позиция добавлена"),
            @ApiResponse(code = 404, message = "Данный контроллер не найден"),
            @ApiResponse(code = 403, message = "Операция запрещена"),
            @ApiResponse(code = 401, message = "Нет доступа к данной операции")}
    )
    public ResponseEntity<?> create(@ApiParam(name = "PositionDto", value = "DTO позиции, которую необходимо создать")
                                    @RequestBody PositionDto positionDto) {
        positionService.create(positionDto);
        log.info("Записан новый экземпляр PositionDto");
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @ApiOperation(value = "update", notes = "Изменение информации о позиции")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Информация о позиции обновлена"),
            @ApiResponse(code = 201, message = "Запрос принят и данные о позиции обновлены"),
            @ApiResponse(code = 404, message = "Данный контроллер не найден"),
            @ApiResponse(code = 403, message = "Операция запрещена"),
            @ApiResponse(code = 401, message = "Нет доступа к данной операции")}
    )
    public ResponseEntity<?> update(@ApiParam(name = "PositionDto", value = "DTO позиции, которую необходимо обновить")
                                    @RequestBody PositionDto positionDto) {
        positionService.update(positionDto);
        log.info("Обновлен экземпляр PositionDto");
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "deleteById", notes = "Удаление позиции по ее id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Позиция удалена"),
            @ApiResponse(code = 204, message = "Запрос получен и обработан, данных для возврата нет"),
            @ApiResponse(code = 404, message = "Данный контроллер не найден"),
            @ApiResponse(code = 403, message = "Операция запрещена"),
            @ApiResponse(code = 401, message = "Нет доступа к данной операции")}
    )
    public ResponseEntity<?> deleteById(@ApiParam(name = "id", type = "Long",
            value = "Переданный в URL id по которому необходимо удалить позицию")
                                        @PathVariable(name = "id") Long id) {
        positionService.deleteById(id);
        log.info("Удален экземпляр PositionDto с id= {}", id);
        return ResponseEntity.ok().build();
    }
}
