<%-- <%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>

<link rel="stylesheet" type="text/css" href="style.css">


</head>
<body>
	<div>
		
		<div class="form">
			<h:form id="form">
			<div class="h2-container">
			<h2>Provider Details</h2>
		</div>

				<center>

					<div class="tb">
						<h:dataTable value="#{daoImpl.showProviderDetails()}" var="p"
							border="1">
							<div class="col">
								<h:column>
									<f:facet name="header">
										<h:outputLabel value="Provider Id" />
									</f:facet>
									<h:outputText value="#{p.providerid}" />
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputLabel value="Provider Firstname" />
									</f:facet>
									<h:outputText value="#{p.firstname}" />
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputLabel value="Provider lastname" />
									</f:facet>
									<h:outputText value="#{p.lastname}" />
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputLabel value="Email" />
									</f:facet>
									<h:outputText value="#{p.email}" />
								</h:column>
								<h:column>
								<f:facet
										name="header">
										<h:outputLabel value="Username" />
									</f:facet>
									<h:outputText value="#{p.username}" />
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputLabel value="Phone number" />
									</f:facet>
									<h:outputText value="#{p.phoneno}" />
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputLabel value="Gender" />
									</f:facet>
									<h:outputText value="#{p.gender}" />
								</h:column>
								<h:column>
									<f:facet name="header">
										<h:outputLabel value="Specialty" />
									</f:facet>
									<h:outputText value="#{p.specialty}" />
								</h:column>
								<f:facet name="header">
									<h:outputLabel value="Type" />
								</f:facet>
								<h:outputLabel value="#{p.type}" />
								<h:column>
									<f:facet name="header">
										<h:outputLabel value="Address" />
									</f:facet>
									<h:outputText value="#{p.address}" />
								</h:column>
								<h:column>
									<f:facet name="header">

									</f:facet>
									<div class="com">
									<h:commandButton
										action="#{daoImpl.searchProviderDetails(p.providerid)}"
										value="Update"></h:commandButton></div>
								</h:column>
							</div>
						</h:dataTable>
					</div>
				</center>
			</h:form>
		</div>
	</div>
</body>
	</html>
</f:view> --%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Table V01</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="icon" type="image/png" href="images/icons/favicon.ico" />

<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">

<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">

<link rel="stylesheet" type="text/css"
	href="vendor/perfect-scrollbar/perfect-scrollbar.css">

<link rel="stylesheet" type="text/css" href="util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
	<div>
		
		<div class="container-table100">
			<h:form id="form">
			<center>
			<div class="h2-container">
			<h2><h:outputText value="Provider Details" /></h2>
			
		</div>

					<div class="tb">
						<h:dataTable value="#{daoImpl.showProviderDetails()}" var="p"
							border="0">
							<div class="col">
								<h:column id="column1">
									<f:facet name="header">
										<h:outputLabel value="Provider Id" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.providerid}" />
								</h:column>
								<h:column id="column2">
									<f:facet name="header">
										<h:outputLabel value=" Firstname" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.firstname}" />
								</h:column>
								<h:column id="column3">
									<f:facet name="header">
										<h:outputLabel value=" lastname" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.lastname}" />
								</h:column>
								<h:column id="column4">
									<f:facet name="header">
										<h:outputLabel value="Email" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.email}" />
								</h:column>
								<h:column id="column5">
								<f:facet
										name="header">
										<h:outputLabel value="Username" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.username}" />
								</h:column>
								<h:column id="column6">
									<f:facet name="header">
										<h:outputLabel value="Phone number" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.phoneno}" />
								</h:column>
								<h:column id="column7">
									<f:facet name="header">
										<h:outputLabel value="Gender" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.gender}" />
								</h:column>
								<h:column id="column8">
									<f:facet name="header">
										<h:outputLabel value="Specialty" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.specialty}" />
								</h:column>
								<%-- <h:column id="column9">
								<f:facet name="header">
									<h:outputLabel value="Type" style="color:white"/>
								</f:facet>
								<h:outputLabel value="#{p.type}" />
								</h:column> --%>
								<h:column id="column10">
									<f:facet name="header">
										<h:outputLabel value="Address" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.address}" />
								</h:column>
									
								<h:column id="column12">
									<f:facet name="header">
										<h:outputLabel value="dateOfBirth" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.dateOfBirth.toString().substring(0,10)}" />
								</h:column>
								<h:column id="column13">
									<f:facet name="header">
										<h:outputLabel value="enrollmentdate" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.enrollmentdate.toString().substring(0, 10)}" />
								</h:column>
								<h:column id="column14">
									<f:facet name="header">
										<h:outputLabel value="licenseNumber" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.licenseNumber}" />
								</h:column>
								<h:column id="column15"> 
									<f:facet name="header">
										<h:outputLabel value="qualification" style="color:white"/>
									</f:facet>
									<h:outputText value="#{p.qualification}" />
								</h:column>
								
								<h:column>
									<div class="com">
										<h:commandButton
											action="#{daoImpl.searchProviderDetails(p.providerid)}"
											value="Update"
											style="background-color: #2ba7e2;
											color: white;
											padding: 10px;
											border-radius: 10px;
											margin-right: 4px;"></h:commandButton>
									</div>
								</h:column>
							</div>
						</h:dataTable>
					</div>
				</center>
			</h:form>
		</div>
	</div>
</body>
	</html>
</f:view>