import React, { useState } from "react";
import { Link } from "react-router-dom";
import { headerData } from "./headerData";


function Header() {
  // state variable declaration
  const {
    title,
    menuDetails: { menuList, margin },
    fontColor,
    bgColor
  } = headerData;
  const [titlePosition, setTitlePosition] = useState(title.position);

  let titlePlacementOrder = 1,
    menuPlacementOrder = 2,
    flexDirection = "row";
  let menuItemsGroupA = [],
    menuItemsGroupB = [],
    groupAMenuPlacementOrder = 1,
    groupBMenuPlacementOrder = 2;

    flexDirection = "column";
  
  // rendering menu items
  const renderMenuItems = (menuItems, menuPlacementOrder) => {
    return (
      <div
        className="menu-container"
        style={{ order: menuPlacementOrder, margin: margin }}
      >
        var i=0;
        {menuItems &&
          menuItems.map((menuItem, index) => {
            return (
              <div
                key={`m-${menuItem.name.toLowerCase()}`}
                className={`m-${menuItem.name.toLowerCase()} menu-item`}
                style={{
                  order: menuItem.order
                }}
              > 
                if()
                
                <Link to="/opportunities">{menuItem?.name || `${menuItem}_${index}`}</Link> 
                let i=i+1;
              </div>
            );
          })}
      </div>
    );
  };

  return (
    <>
      <div
        className="header-container"
        style={{ flexDirection, backgroundColor: bgColor }}
      >
        <div
          className="title-container"
          style={{
            order: titlePlacementOrder,
            backgroundColor: title.bgColor || "transparent",
            color: title.fontColor || fontColor,
            margin: title.margin
          }}
        >
          {title?.name || "Company Name"}
        </div>
        {titlePosition === "center" ? (
          <>
           {renderMenuItems(menuItemsGroupA, groupAMenuPlacementOrder)}
            {renderMenuItems(menuItemsGroupB, groupBMenuPlacementOrder)}
          </>
        ) : (
          <>{renderMenuItems(menuList, menuPlacementOrder)}</>
        )}
      </div>
    </>
  );
}

export default Header

