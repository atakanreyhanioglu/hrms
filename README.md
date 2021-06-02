# hrms
Human Resource Management System

![bannerResim](https://i.ibb.co/j8FF1hf/Data-Access-3.jpg)




## :pushpin:Proje Hakkında
N-Katmanlı Solid mimari yapısı ile hazırlanan, SpringBoot kullanılarak CRUD işlemlerinin yapıldığı 
İnsan Kaynakları Yönetim Sistemi Projesidir.Proje içerisinde data kaynakları kolayca değiştirilebilir,
yeni nesneler eklenebilir, bütün iş istekleri değiştirilebilir.Yapılacak olanlar eski kodları bozmadan 
sürekli ekleme yapılabilir.Proje sürdürülebilirlik prensibini yerine getirmektedir.
## :books:Katmanlar
![entities](https://s3.gifyu.com/images/Data-Access.gif)

### Entities Katmanı
**Entities Katmanı**'nda **concretes**  klasörü bulunmaktadır.Concretes klasörü veri tabanından 
gelen somut nesnelerin özelliklerini tutmak için oluşturulmuştur.
<br> <br>:file_folder:`concretes`  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [Candidate.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/entities/concretes/Candidate.java) 
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [Employer.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/entities/concretes/Employer.java) 
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [User.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/entities/concretes/User.java) 
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [JobTitle.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/entities/concretes/JobTitle.java)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [JobAdvertisement.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/entities/concretes/JobAdvertisement.java)
<br><br>![dataaccesskatmani](https://i.ibb.co/f1cQDbm/Data-Access-2.jpg)
<br>


###  Data Access Katmanı
**Data Access Katmanı**'nda  **abstracts**  klasörü bulunmaktadır.Abstracts klasöründe Jpa Repository kullanılarak 
CRUD operasyonları Data Erişim Objeleri(DAO) için oluşturulmuştur.
<br> <br> :file_folder:`abstracts` 
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [CandidateDao.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/dataAccess/abstracts/CandidateDao.java)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [EmployerDao.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/dataAccess/abstracts/EmployerDao.java)
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [JobTitleDao.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/dataAccess/abstracts/JobTitleDao.java)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [CityDao.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/dataAccess/abstracts/CityDao.java)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [JobAdvertisementDao.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/dataAccess/abstracts/JobAdvertisementDao.java)  
<br><br>![businesskatmani](https://i.ibb.co/ZGmxqKk/Data-Access-5.jpg)
<br>
###  Business Katmanı
**Business Katmanı**'nda  **abstracts** ve **abstracts**  klasörleri bulunmaktadır.**Business Katmanı** iş isterlerimizi kodladığımız katmandır. 
<br> <br> :file_folder:`abstracts` 
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [CandidateService.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/business/abstracts/CandidateService.java)  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [EmployerService.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/business/abstracts/EmployerService.java)
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [EmployerCheckService.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/business/abstracts/EmployerCheckService.java)
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [JobTitleService.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/business/abstracts/JobTitleService.java)
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [JobTitleCheckService.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/business/abstracts/JobTitleCheckService.java)
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:page_facing_up: [JobAdvertisementService.java](https://github.com/atakanreyhanioglu/hrms/blob/master/hrms/src/main/java/kodlamaio/hrms/business/abstracts/JobAdvertisementService.java)

###  Apiden Görüntüler
![gif](https://i.ibb.co/xq08qTt/odev.gif) 
