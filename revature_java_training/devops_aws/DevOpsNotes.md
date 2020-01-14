# DevOps
"DevOps" is the combination of the words "Development" and "Operations." This term is often used to refer to a process or a culture. It alludes to the combination of the development team (the people who write the code) and the operations team (the people who maintain the infrastructure). The goal is to minimize barriers between developers and operations in order to lead to faster development of the product.

## Software Development Lifecycle (SDLC)
The Software Developmetn Lifecycle is the process for planning, creating, testing, and displaying an information system. It is basically the type of process you follow while building software and making it available to end users. Here are are general steps in SDLC:
1. **Requirement Phase**. The requirements for the system being built are gathered. Typically done by Business Analysts
2. **Analysis Phase**. Deficiencies in the existing system are found based on the requirements that were gathered. Typically involves Business Analysts and Senior members of the team.
3. **Design Phase**. Software is designed. No coding is done yet. Product features are planned out. Typically involves architects and Senior Developers.
4. **Development Phase**. Software is build and code is written. Code is written by Developers (senior, junior, etc.)
## Waterfall
The **Waterfall** model is a subset of the SDLC. It is the traditional way of building software and it involves moving from steps 1-6 without being able to backtrack. If you want to return to a previous step, you have to start over from the very begining. This approach is best-suited for projects that are very small or have unchanging requirements.
## Agile
**Agile** is an iterative approach to software development. Agile is not a "thing that you do" it is more of a mindset or a philosophy. It allows for requirements to evolve while the software is being built. It is best-suited for larger projects. Good agile practices include "pushing early and often" as well as following good CI/CD practices.
## Scrum
A **Scrum** is the most popular type of Agile methodology/framework. Under this way of doing things, the development process is split up into **sprints**, which are iterations of the product. Each sprint usually lasts anywhere between 2 to 4 weeks. Each day during the a sprint, a **daily standup meeting** is conducted.

Required features are usually split up into what are called **user stories**, which essentially are descriptions of the functionality that the product should include. Usually, they are written from the perspective of the type of role that the functionality is ascribed to. Example:

    "As a customer, when I click on a button, my order is placed"
 
User stories are typically assigned **story points** by the scrum team depending of the **level of effort** that each requires to be completed. More points usually indicate a more difficult user story.

## CI/CD/CD
**Continuous Integration** is the process of continuously merging code int a central repository and checking if it integrates well with the code base. An example of this would be to make a change to the code base and then push the code to git hub. Good practice dictates that you "push early and push often." Multiple integrations should occur each day. This approach usually leads to reduced integration problems.

The goal of **Continuious Delivery** is to build software so that it is always in a state where it could be put into production. Typically, Continuous Delivery is Continuous Integration plus whatever processes are necessary to prepare for the deployment to production. This often involves a DevOps Pipeline that will trigger automated processes. This would typically look like:
1. Code is pushed to the repository
2. This merging of code will trigger a tool to test and build your applicaiton
3. The applicaiton is deployed to some sort of staging environment
4. The applicaiton undergoes some sort of acceptance testing
5. The application is manually deployed to production

**Continuous Deployment** is one step beyond Continuous Delivery. Instead of manually deploying the application to production, the application will automatically be deployed to production (assuming all tests pass) every time that code is merged into the repository.

## Maven Lifecyle
The **Maven Lifecycle** is a precess for building and distributing a particualr artifcat. The following is the  Maven Build Lifecycle:
1. **Validate**. Validate project is correct and all necessary info is available. It checks for the POM, parses it and locates/download dependencies.
2. **Compile**. Compile the source code of project
3. **Test**. test the code using appropriate unit testing framework
4. **Package**. take compilred code and package it into a distributable format like jar or war
5. **Verify**. run checks on the results of integration tests to ensure quality is met
6. **Install**. install package into local repository for use as dependency in other projects
7. **Deploy**. copies final package into remote repository

## Sonar
"Sonar" refers to a group of tools that focuses on analyzing code quality. These tools attempt to expose "**code smells**", **vulnerbilities**, and **bugs**. Code smells are pieces of code that are functionally correct, but written in a way that is difficult to maintain. Vulnerabilities are security related issues. Bugs are issues that represent something wrong in the code.

**Sonar Lint** is a linter that can be used in your IDE. It will underline portions of you code that is identified as having an issue. It encourages better coding practices,and gives you instantaneous feedback on your code. **Sonar Cloud** is a cloud-based solution, where you can configure and veiw an appliation's code analysis on the cloud. **Sonar Qube** is a central server which processes full analyses, which you build into your pipeline.


