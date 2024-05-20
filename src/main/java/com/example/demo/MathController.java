package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @PostMapping("/add")
    public double addPost(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @PostMapping("/subtract")
    public double subtractPost(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @PostMapping("/multiply")
    public double multiplyPost(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    @PostMapping("/divide")
    public double dividePost(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    @GetMapping("/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        return Math.pow(base, exponent);
    }

    @PostMapping("/power")
    public double powerPost(@RequestParam double base, @RequestParam double exponent) {
        return Math.pow(base, exponent);
    }
}
