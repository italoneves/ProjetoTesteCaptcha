//package com.teste.sandboxcie.controller;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.teste.sandboxcie.model.CardInfo;
//
//@RestController
//@RequestMapping("/api")
//public class ControllerApi {
//	
//     private String urlDefault = "https://apiquerysandbox.cieloecommerce.cielo.com.br/1/cardBin/";
//     
//	 @GetMapping(value = "/bin/{numero}")
//	 public ResponseEntity<String> buscarId(@PathVariable String numero){
//		 	
//		 		String url = urlDefault+numero;
//		 		RestTemplate restTemplate = new RestTemplate();
//		 		
////		 		CardInfo retornoApi = restTemplate.getForObject(url,CardInfo.class);
//		 		org.springframework.http.HttpHeaders  headers = new org.springframework.http.HttpHeaders();
//	
//		 		headers.set("merchantId", "940e6936-dfc2-497a-9a9b-c4f651c61966");
//		 		headers.set("merchantKey", "OEKTORZGWWBPBYJHATHVJXNQKMPIGNTYZMCHSSG");
//		 	
//		 		HttpEntity request = new HttpEntity(headers);
//		 		
//		 		String bandeira = "Bandeira não identificada";
//		 		try {
//		 			ResponseEntity<CardInfo> retornoApi = restTemplate.exchange(
//			 				url, HttpMethod.GET, request, CardInfo.class );
//		 			
//			 		if(retornoApi.getStatusCode() == HttpStatus.OK){
//			 			bandeira = retornoApi.getBody().getProvider();
//			 			System.out.println("Print deu certo: " + bandeira);
//			 		}else {
//			 			//Log
//			 			System.out.println("Print aqui " + retornoApi.getStatusCode());
//			 		}
//				} catch (Exception e) {
//					System.out.println("Teve uma exception na chamada a api");
//					
//				}
//		 				 	
//	            return ResponseEntity.status(HttpStatus.OK).body(bandeira);
//
//	    }
//	
//	
//
//}
