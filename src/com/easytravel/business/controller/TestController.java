package com.easytravel.business.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.easytravel.tools.FileUpload;

@Controller
public class TestController {
	@RequestMapping("/testupload")
	public ModelAndView testUploadFile(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "file") MultipartFile file) throws IOException{
		Map<String, Object> message = new HashMap<String, Object>();
		String fileInfo = FileUpload.upLoadFile("c:\\tools\\testupload", file.getOriginalFilename(), file.getBytes());
		String fileType = FileUpload.getFileType(fileInfo);
		return null;
	}
}
