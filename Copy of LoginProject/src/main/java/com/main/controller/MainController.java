package com.main.controller;

import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.service.AccountServiceInt;
import com.main.service.ServiceIntf;
import com.main.model.Account;
import com.main.model.Benificiary;
import com.main.model.Registration;
import com.main.model.Transaction;


@Controller
public class MainController {
@Autowired
ServiceIntf service;

@Autowired
AccountServiceInt serviceAcc;

@RequestMapping("/Reg")
public ModelAndView register(@ModelAttribute("reg") Registration reg)
{
	return new ModelAndView("Registration");
}
@RequestMapping("/save")
public ModelAndView save(@ModelAttribute("reg") Registration reg)
{
	reg.setPassword(Base64.getEncoder().encodeToString(reg.getPassword().getBytes()));
	service.saveEmp(reg);
	return new ModelAndView("redirect:/login");
}

@RequestMapping("/login")
public ModelAndView Login(@ModelAttribute("reg") Registration reg)
{
	return new ModelAndView("LoginPage");
}

@RequestMapping("/check")
public ModelAndView check(HttpServletRequest request,@ModelAttribute("reg") Registration reg)
{
	Registration r=service.check(reg);
	
	if(r!=null)
	{
		HttpSession session=request.getSession();
		session.setAttribute("regis", r);
		session.setAttribute("reg", reg);
		return new ModelAndView("redirect:/savingsCheck");
	}
	else
	{
		return new ModelAndView("LoginPage");
	}
	
}

@RequestMapping("/savingsCheck")
public ModelAndView savingsCheck(HttpServletRequest request,@ModelAttribute("reg") Registration reg)
{
	HttpSession session=request.getSession();
	Registration r1=(Registration) session.getAttribute("regis");
	Account r= serviceAcc.findById(r1.getId(),"savings");
	return new ModelAndView("Success","rs",r);
}

@RequestMapping("/savings")
public ModelAndView savings(HttpServletRequest request,@ModelAttribute("reg") Registration reg)
{
	HttpSession session=request.getSession();
	Registration r1=(Registration) session.getAttribute("regis");
	serviceAcc.createAcc(request,r1.getId());
	return new ModelAndView("redirect:/savingsCheck");
}

@RequestMapping("/benefit")
public ModelAndView benefitPage(HttpServletRequest request,@ModelAttribute("reg") Registration reg)
{
	String str="benefit";
	return new ModelAndView("BenefitPage","str",str);
}

@RequestMapping("/transfer")
public ModelAndView transferPage(HttpServletRequest request,@ModelAttribute("reg") Registration reg)
{
	String str="transfer";
	return new ModelAndView("BenefitPage","str",str);
}

@RequestMapping("/TransferWithinBank")
public ModelAndView TransferWithinBank(HttpServletRequest request,@ModelAttribute("ben") Benificiary ben)
{
	return new ModelAndView("TransferWithinBankPage");
}
@RequestMapping("/TransferOutsideBank")
public ModelAndView TransferOutsideBank(HttpServletRequest request,@ModelAttribute("ben") Benificiary ben)
{
	return new ModelAndView("TransferOutsideBankPage");
}

@RequestMapping("/WithinBankTransaction")
public ModelAndView WithinBankTransaction(HttpServletRequest request,@ModelAttribute("tran") Transaction tran)
{
	HttpSession session=request.getSession();
	Registration r1=(Registration) session.getAttribute("regis");
	Registration r2=service.findById(r1.getId());
	return new ModelAndView("WithinBankTransactionPage","reg",r2);
}

@RequestMapping("/OutsideBankTransaction")
public ModelAndView OutsideBankTransaction(HttpServletRequest request,@ModelAttribute("tran") Transaction tran)
{
	HttpSession session=request.getSession();
	Registration r1=(Registration) session.getAttribute("regis");
	Registration r2=service.findById(r1.getId());
	return new ModelAndView("OutsideBankTransactionPage","reg",r2);
}

@RequestMapping("/TransferWithin")
public ModelAndView TransferWithin(HttpServletRequest request,@ModelAttribute("ben") Benificiary ben)
{
	HttpSession session=request.getSession();
	Registration r1=(Registration) session.getAttribute("regis");
	serviceAcc.createAccWithin(request,r1.getId(),ben);
	return new ModelAndView("redirect:/savingsCheck");
}

@RequestMapping("/TransferOutside")
public ModelAndView TransferOutside(HttpServletRequest request,@ModelAttribute("ben") Benificiary ben)
{
	HttpSession session=request.getSession();
	Registration r1=(Registration) session.getAttribute("regis");
	System.out.println(r1.getId());
	serviceAcc.createAccOutside(request,r1.getId(),ben);
	return new ModelAndView("redirect:/savingsCheck");
}

@RequestMapping("/saveTranWithin")
public ModelAndView saveTranWithin(HttpServletRequest request,@ModelAttribute("tran") Transaction tran)
{
	HttpSession session=request.getSession();
	Registration r1=(Registration) session.getAttribute("regis");
	System.out.println(r1.getId());
	Account r= serviceAcc.findById(r1.getId(),"savings");
	serviceAcc.saveTranWithin(request,r1.getId(),tran,r);
	return new ModelAndView("redirect:/savingsCheck");
}

@RequestMapping("/showTran")
public ModelAndView showTran(HttpServletRequest request,@ModelAttribute("tran") Transaction tran)
{
	
	return null;
	
}
}
/*@RequestMapping("/display")
public ModelAndView Display(@ModelAttribute("reg") Registration reg)
{
	List<Registration>ls=service.display();
	return new ModelAndView("DisplayPage","ls",ls);
}
@RequestMapping("/edit")
public ModelAndView edit(HttpServletRequest request,@ModelAttribute("reg") Registration reg)
{
	List<Registration>ls=service.display();
	int id=Integer.parseInt(request.getParameter("id"));
	System.out.println("id "+id);
	Registration r= service.edit(id);
	System.out.println("first name "+r.getFirstName());
	ModelAndView m= new ModelAndView("EditPage","ls",ls);
	m.addObject("r", r);
	return m;
}*/
