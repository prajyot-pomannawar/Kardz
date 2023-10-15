import React from "react";
import coverPhoto from "../Assets/images/download.jpeg";
import profilePhoto from "../Assets/images/Sharvarish.jpeg";
import email from "../Assets/images/email.jpg";
import googleMaps from "../Assets/images/location.jpg";
import website from "../Assets/images/website.png";
import instagram from "../Assets/images/Emblem-Instagram.jpg";
import downloadSymbol from "../Assets/images/downloadSymbol1.jpeg"
import callingSymbol from "../Assets/images/callingSymbol.jpeg"
import "../CSS/coverPhoto.css";
import "../CSS/profilePhoto.css";
import "../CSS/name.css";
import "../CSS/buttonsDownload.css";
import "bootstrap/dist/css/bootstrap.min.css";

const Business = () => {
  return (
    <div className="container">
      <div className="row">
        <div className="col-lg-12">
          <div className="cover-photo-container">
            <img src={coverPhoto} alt="Cover Photo" className="cover-photo" />
          </div>
          {/* End of the cover photo */}
        </div>

        <div className="col-md-4">
          <div className="profile-photo-container">
            <img
              src={profilePhoto}
              alt="Profile Photo"
              className="profile-photo"
            />
          </div>
          {/* End of the profile photo */}
        </div>
      </div>
      {/* End of row */}

      <div className="row" style={{ marginLeft: "40px" }}>
        <div className="col-md-12">

          <div className="col-md-6">
          <div className="name-text">
            <h4>SHARVARISH SHASHIKANT PARULEKAR</h4>
          </div>
          {/* End of the name and post */}

          <div className="col-md-6">
            <h6>Software Developer</h6>
          </div>
          </div>

          <div className="col-md-2">
            <div className="row gy-3 my-3">
              <div className="col-md-4 calling-symbol">
                <img src={callingSymbol} alt="Calling Symbol" style={{ width: "50px", height: "50px"}} />
              </div>
              <div className="col-md-4 download-symbol">
                <img src={downloadSymbol} alt="Download Symbol" style={{ width: "50px", height: "50px"}} />
              </div>
            </div>
          </div>

          
          <br></br>

          <div>
            <div className="text-information benefit-div">
              <h3>
                <strong>
                  <u>About</u>
                </strong>
              </h3>
              <div
                class="card card1 card border-primary mb-3 cardSize"
                style={{ height: "100px", width: "100%", border: "none" }}
              >
                <p>Hi my name is sharvarish</p>
              </div>
            </div>
          </div>

          {/* This code is for the icons*/}
          
          <div className="row gy-3 my-3">
            {/* we have taken md-6 as we want 2 cards in one row*/}
            <h3>
              <strong>
                <u>Lets's Talk</u>
              </strong>
            </h3>

            <div class="col-sm-6 col-md-3 colContent">
              
                <div
                  class="card border-primary mb-3 cardSize"
                  style={{
                    height: "150px",
                    width: "180px",
                    border: "3px solid #3498db",
                    borderRadius: "15px",
                    boxShadow: " 0 0 10px rgba(0, 0, 0, 0.1)",
                  }}
                >
                  <div
                    class="d-flex align-items-center justify-content-center flex-column"
                    style={{ height: "100%"}}
                  >
                    <img
                      src={instagram}
                      class="card-img-top mfImg"
                      alt="Failed to load Image"
                      style={{ width: "120px", height: "120px" }}
                    />
                  </div>
                </div>
            </div>

            <div class="col-sm-6 col-md-3 colContent">
                <div
                  class="card border-primary mb-3 cardSize"
                  style={{
                    height: "150px",
                    width: "180px",
                    border: "3px solid #3498db",
                    borderRadius: "15px",
                    boxShadow: " 0 0 10px rgba(0, 0, 0, 0.1)",
                  }}
                >
                  <div
                    class="d-flex align-items-center justify-content-center flex-column"
                    style={{ height: "100%" }}
                  >
                    <img
                      src={email}
                      class="card-img-top mfImg"
                      alt="Failed to load Image"
                      style={{ width: "120px", height: "120px" }}
                    />
                  </div>
                </div>
            </div>

            <div class="col-sm-6 col-md-3 colContent">
                <div
                  class="card border-primary mb-3 cardSize"
                  style={{
                    height: "150px",
                    width: "180px",
                    border: "3px solid #3498db",
                    borderRadius: "15px",
                    boxShadow: " 0 0 10px rgba(0, 0, 0, 0.1)",
                  }}
                >
                  <div
                    class="d-flex align-items-center justify-content-center flex-column"
                    style={{ height: "100%" }}
                  >
                    <img
                      src={website}
                      class="card-img-top mfImg"
                      alt="Failed to load Image"
                      style={{ width: "120px", height: "120px" }}
                    />
                  </div>
                </div>
            </div>

            <div class="col-sm-6 col-md-3 colContent">
                <div
                  class="card border-primary mb-3 cardSize"
                  style={{
                    height: "150px",
                    width: "180px",
                    border: "3px solid #3498db",
                    borderRadius: "15px",
                    boxShadow: " 0 0 10px rgba(0, 0, 0, 0.1)",
                  }}
                >
                  <div
                    class="d-flex align-items-center justify-content-center flex-column"
                    style={{ height: "100%" }}
                  >
                    <img
                      src={googleMaps}
                      class="card-img-top mfImg"
                      alt="Failed to load Image"
                      style={{ width: "120px", height: "120px" }}
                    />
                  </div>
                </div>
            </div>
          </div>

          <br></br>

          <div className="buttons-download">
            <button className="btn btn-light-green btns m-8" style={{borderRadius:'40px'}}>
              Send WhatsApp
            </button>

            <button className="btn btn-primary btns m-8" style={{borderRadius:'40px',marginRight:'70px'}}>
              + Connect
            </button>

          </div>

          <br></br>
        </div>
      </div>
      {/* End of another row */}
    </div>
  );
};

export default Business;
