using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace DonneesPharma.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult About()
        {
            ViewBag.Message = "Ce qu'il faut savoir";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Nos coordonnées :";

            return View();
        }

        public ActionResult PharmaProximite()
        {
            ViewBag.Message = "Vous cherchez la pharmacie la plus proche de vous ?";
            return View();
        }


    }
}